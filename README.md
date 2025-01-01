FileCompressorDecompressor
----------------------------------------------

A simple Java-based utility to compress and decompress files using DeflaterOutputStream and InflaterInputStream from the java.util.zip package.

Features
--------

File Compression: Compresses files into a smaller size using the Deflater algorithm.

File Decompression: Decompresses files back to their original state.

Interactive CLI: Command-line interface to interact with the program.

How It Works
-----------

Compression:
-----------

Reads data from the input file in chunks.

Compresses the data using DeflaterOutputStream.

Saves the compressed data to the specified output file.

Decompression:
---------------

Reads compressed data from the input file using InflaterInputStream.

Decompresses and writes the data to the specified output file.

Requirements
------------

Java Development Kit (JDK) 8 or later.

How to Run
----------

1.Clone the repository:
------------------------

git clone https://github.com/lucky-arya/FileCompressorDecompressor.git

2.Navigate to the project directory:
----------------------------------

cd FileCompressorDecompressor

3.Compile the program:
----------------------

javac FileCompressorDecompressor.java

4.Run the program:
------------------

java FileCompressorDecompressor

Usage
------

1.When prompted, select an operation:

    Enter 1 for compression.

    Enter 2 for decompression.

2.Provide the input file path and output file path as requested.

3.The program will notify you upon successful completion of the operation.

Example
-------

Compression
----------

Input: example.txt

Output: example_compressed.txt

Select operation:
1. Compress
2. Decompress
Enter your choice (1 or 2): 1
Enter the path of the file to compress: example.txt
Enter the path where the compressed file should be saved: example_compressed.txt
File compressed successfully to: example_compressed.txt

Decompression

Input: example_compressed.txt

Output: example_decompressed.txt

Select operation:
1. Compress
2. Decompress
Enter your choice (1 or 2): 2
Enter the path of the compressed file: example_compressed.txt
Enter the path where the decompressed file should be saved: example_decompressed.txt
File decompressed successfully to: example_decompressed.txt

Contributing
--------------

1.Fork the repository.

2.Create a new branch for your feature or bug fix:

   git checkout -b feature-name

3.Commit your changes:

    git commit -m "Description of changes"

4.Push to the branch:

    git push origin feature-name

5.Open a Pull Request.
