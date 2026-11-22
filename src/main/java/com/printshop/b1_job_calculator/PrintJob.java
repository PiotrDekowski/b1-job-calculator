package com.printshop.b1_job_calculator;


/**
 * Represents a commercial print job scheduled for a B1 offset printing press.
 * Stores job specifications and validates sheet dimensions against press limits.
 */
public class PrintJob {

    // Constants: min and max sheet size for the B1 press (in mm)
    public static final int MAX_WIDTH_MM = 750;
    public static final int MAX_HEIGHT_MM = 1060;
    public static final int MIN_WIDTH_MM = 340;
    public static final int MIN_HEIGHT_MM = 480;


    // Fields: details of a single print job
    private String jobName;
    private int sheetWidthMm;
    private int sheetHeightMm;
    private int netQuantity;

    // Constructor: creates a new print job with given values
    /**
     * Creates a new print job.
     *
     * @param jobName       name of the job
     * @param sheetWidthMm  sheet width in mm
     * @param sheetHeightMm sheet height in mm
     * @param netQuantity   number of finished copies needed
     */
    public PrintJob(String jobName, int sheetWidthMm, int sheetHeightMm, int netQuantity) {
        this.jobName = jobName;
        this.sheetWidthMm = sheetWidthMm;
        this.sheetHeightMm = sheetHeightMm;
        this.netQuantity = netQuantity;
    }

    /**
     * Checks if the sheet uses the full standard B1 format (1000 x 700 mm).
     */
    public boolean isStandardB1() {
        return sheetWidthMm == 1000 && sheetHeightMm == 700;
    }

    // Methods: actions and checks for this job
    /**
     * Checks if the sheet size fits in the B1 press.
     *
     * @return true if the sheet size is valid, false if too small or too big
     */
    public boolean isValidSheetSize() {
        return sheetWidthMm >= MAX_WIDTH_MM && sheetWidthMm <= MAX_WIDTH_MM && sheetHeightMm >= MIN_HEIGHT_MM && sheetHeightMm <= MAX_HEIGHT_MM;
    }


}
