#!/bin/bash

# @author lokeshwar
# reviewed @ 04-07-2020

# Transfer user data to server along with node scripts and trigger them thru ssh

for f in ~/Downloads/*.csv; do
	echo -e $f
done
read  -n 1 -p "Are you sure about the above files bhai !!!, continue ? (y/n):" "exit"
echo ""

if [ $exit != "y" ] ; then
	echo -e "script NOT executed"
else
	echo -e "##################### SCRIPT STARTED ##################### : $(date)"
	
	#1. create folder
	folderName=$(date +'%d-%m-%Y')
	dir=~lokesh/Downloads/$folderName
	rm -rf $dir
	mkdir -p $dir
	
	if [ $? -ne 0 ]; then
		echo -e "S1 : FAILED : creating directory with @ $dir, bye..."
		return
	else
		echo -e "S1 : SUCCESS: creating directory @ $dir"
	fi
	
	#2. move these files to a single folder
	for f in ~/Downloads/*.csv; do
		mv $f $dir
	done
	echo -e "S2 : SUCCESS: Files moved to $dir"
	
	#3. copy node and bash scripts 
	cp "/home/lokesh/git/qa_repo/pn/GA_open_L&M_Normal_D8.js" $dir
	cp "/home/lokesh/git/qa_repo/pn/GA_OPEN_PQON_Big_D8.js" $dir
	cp "/home/lokesh/git/qa_repo/pn/run2.sh" $dir
	echo -e "S3 : SUCCESS: Node files and run2.sh file copied to $dir"
	
	echo -e "S4 : MANUAL copying files to git repo folder. (now doing at last)"
	
	#5. send this folder to server
	sshpass -p $prod scp -r -P 3108 $dir usr@00.00.00.00:/home/tailor
	if [ $? -ne 0 ]; then
		echo -e "S5 : FAILED: transfering files to VM, bye..."
		return
	else
		echo -e "S5 : SUCCESS: transfering files to VM 172.18.3.60"
	fi	
	
	#6. trigger the script	
	sshpass -p $prod ssh -p 3108 usr@00.00.00.00 "cd /home/tailor/$folderName && ./run2.sh"
	echo -e "S6 : SUCCESS : triggered PNs, bye..."	
		
	echo -e "##################### SCRIPT ENDED ##################### : $(date)"	
fi
