package bitmap.transformer;
//Gather user input (infile, outfile, and transform)
//Read the input bitmap file
//Parse the bitmap’s data into a Bitmap object (instance of a Bitmap class that you write)
//Using data from the parsed Bitmap, run a transform on the data directly (mutate the color or similar)
//Write the mutated image data to the output file path
public class Bitmap {
    String inputFilePath;
    String outputFilePath;
    String name;

    public Bitmap (String inputFilePath, String outputFilePath, String name){
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
        this.name = name;
    }

}
