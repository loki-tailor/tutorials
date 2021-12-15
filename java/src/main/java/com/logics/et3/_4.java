package com.logics.et3;

import java.io.IOException;

public class _4 {

	public static void main(String[] args) {
		System.out.println(main());
	}

	public static float main() {
		float f = 0.0f;
		try {

			throw new IOException(); // this is permitted

//			f = Float.valueOf(f).floatValue();
//			return f;
			
//			throw new IOException();
//			return f;

		} catch (Exception nfe) { System.out.println("invalid input " + f); return f;	}
//		} catch (IOException nfe) { System.out.println("invalid input " + f); return f;	}
//		} catch (NumberFormatException nfe) { nfe.printStackTrace(); System.out.println("invalid input " + f); return f;	}
//		} catch (IOException | NumberFormatException nfe) { nfe.printStackTrace(); System.out.println("invalid input " + f); return f;	}
		
		finally {
			System.out.println("Finally");
			return 20.f;
		}
		
//		return f;
		

//		return f; // error
	}
}
