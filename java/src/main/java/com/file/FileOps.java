package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileOps {

	// ------------------------------------------------------------------------------------------
	/***
	 * 
	 * @param source
	 * @param target
	 * @param options
	 * @throws IOException
	 * 
	 * @ref: http://tutorials.jenkov.com/java-nio/files.html#files-walkfiletree
	 * @ref: https://stackoverflow.com/a/60621544/7415499
	 * @ref :
	 *      https://www.geeksforgeeks.org/path-resolve-method-in-java-with-examples/
	 * @ref :
	 *      https://www.geeksforgeeks.org/path-relativize-method-in-java-with-examples/
	 */
	public static void copyDir(Path source, Path target, CopyOption... options) throws IOException {

		Files.walkFileTree(source, new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

				// new dir path where data is to be copied
				// could be present or absent
				Path resolve = target.resolve(source.relativize(dir));
				File resolve_file = resolve.toFile();

				if (resolve_file.exists() == false) {
					Files.createDirectory(resolve);
				} else {
					// delete old data in sub-directories
					// without deleting the directory
					Arrays.asList(resolve_file.listFiles()).forEach(File::delete);
				}
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				Files.copy(file, target.resolve(source.relativize(file)));
				return FileVisitResult.CONTINUE;
			}
		});
	}

	// ------------------------------------------------------------------------------------------

	/*
	 * Written by Satish Kumar on Friday 1/7/2016
	 * 
	 */

	// Use this method to create new file or overwrite all the existing content to
	// write new content passed to the method
	public static void write(String path, String content) {
		try {
			File file = new File(path);
			// If file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			// Write in file
			bw.write(content);
			// Close connection
			bw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// ------------------------------------------------------------------------------------------

	// Call this method to append data to the existing file
	public static synchronized void append(String path, String content) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
			out.println(content);
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	// ------------------------------------------------------------------------------------------
	public static void mkdir(final Path dirToCreate, boolean purge_old_data) throws IOException {

		File dir_file = dirToCreate.toFile();

		if (dir_file.exists())

			if (purge_old_data)

				// for each-sub directory
				// delete its content
				Files.walkFileTree(dirToCreate, new SimpleFileVisitor<Path>() {
					@Override
					public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
						System.out.println("delete file: " + file.toString());
						Files.delete(file);
						return FileVisitResult.CONTINUE;
					}

					@Override
					public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {

						Files.delete(dir);
						System.out.println("delete dir: " + dir.toString());
						return FileVisitResult.CONTINUE;
					}
				});
			else {
				System.out.println(
						"dir exists with some data, caller requested not to delete @ " + dirToCreate.toAbsolutePath());
				return;
			}

		Files.createDirectory(dirToCreate);
		System.out.println("created dir: " + dirToCreate.toAbsolutePath());

	}

	// ------------------------------------------------------------------------------------------

	public static void mkdir(final Path path) {
		if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS) == false) {
			try {
				Files.createDirectory(path.toAbsolutePath());
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
			System.out.println("directory created @ " + path.toAbsolutePath());
		} else {
			System.out.println("directory already exists, not recreating @ " + path.toAbsolutePath());
		}
	}

	// ------------------------------------------------------------------------------------------

	private static void createDir(final String dirName) {
		try {
			final File homeDir = new File(System.getProperty("user.home"));
			final File dir = new File(homeDir, dirName);
			if (!dir.exists() && !dir.mkdirs()) {
				System.out.println("Couldn't create dir:" + dir.getAbsolutePath());
			}
			System.out.println("dir created @ " + dir.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ------------------------------------------------------------------------------------------

	public static String readFile(final String filePath) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			br.close();
			return sb.toString();

		} catch (Exception e) {

		}
		return null;
	}

	// ------------------------------------------------------------------------------------------

	public static List<String> readFileAsList(final String filePath) {

		List<String> list = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				list.add(line);
				line = br.readLine();
			}
			br.close();
			return list;

		} catch (Exception e) {

		}
		return list;
	}

	// ------------------------------------------------------------------------------------------

	public static void deleteFile(final String filePath) {
		try {

			final File file = new File(filePath);
			if (file.exists() && file.delete()) {
				System.out.println("Deleted File:" + file.getAbsolutePath());
			} else {
				System.out.println("Couldn't delete file:" + file.getAbsolutePath());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ------------------------------------------------------------------------------------------

	public static void main(String[] args) {
		System.out.println("hello world");
		Path d = Paths.get("src/res/fv/copy");
		try {
			mkdir(d, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}
}
