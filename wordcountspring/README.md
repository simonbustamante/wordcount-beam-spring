# Instructions to clone and run this demonstration
### (Tested on Ubuntu 20.04,  Eclipse IDE and java version "1.8.0_271")

1. Open a terminal in your OS ("Control + Alt + T")

2. Clone the repository by running the next command:

  >git clone https://github.com/simonbustamante/wordcount-beam-spring.git
  
3. Open Eclipse

4. Open the folder of the project ("File -> Open Projects From File System")

  * /<your_path/wordcount-beam-spring/wordcontspring
  
5. Select Secondary Click on "pom.xml -> Run As -> Maven Install" and wait while the compilation process finished 

6. Open the "/<your_path/wordcount-beam-spring/wordcontspring/target" folder with your Terminal to access the "wordcountspring-0.0.1-SNAPSHOT.jar"

7. Run the "wordcountspring-0.0.1-SNAPSHOT.jar" as follows:

  * java -jar wordcountspring-0.0.1-SNAPSHOT.jar --inputFile="/<your_path>/truelogic.txt" --outputFile="/<your_path>/output" --extFile=".csv"
  

8. output file will be called like "output-00000-of-00001.csv"

9. Open the file with your text editor and you will be able to see each word with the  counted number 

