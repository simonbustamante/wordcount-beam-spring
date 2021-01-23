package com.truelogic.wordcountspring;

import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.PipelineOptions;

public interface WordCountOptions extends PipelineOptions {

    @Description("Path to the input file")
    @Default.String("./src/main/resources/input/*")
    String getInputFile();
    void setInputFile(String value);

    @Description("Path to the output file")
    @Default.String("./src/main/resources/output/output.txt")
    String getOutputFile();
    void setOutputFile(String value);
    
    @Description("Extension")
    @Default.String(".csv")
    String getExtFile();
    void setExtFile(String value);
}