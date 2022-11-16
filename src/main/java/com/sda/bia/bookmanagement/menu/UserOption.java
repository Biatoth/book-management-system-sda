package com.sda.bia.bookmanagement.menu;

public enum UserOption {
    CREATE_AUTHOR(1, "Create author"),
    EXIT(99,"Exit"),
    UNKNOWN(100, "Unknown option");

    private int numericOption;
    private String displayValue;

    UserOption(int numericOption, String displayValue) {
        this.numericOption = numericOption;
        this.displayValue = displayValue;
    }

    public static void printAllOptions() {
    }


    public int getNumericOption() {
        return numericOption;
    }

    public void setNumericOption(int numericOption) {
        this.numericOption = numericOption;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }
    public static UserOption findUserOption(int numericValue){
        for(UserOption value : values()){
            if(value.getNumericOption() == numericValue){
                return value;
            }
        }
        return UNKNOWN;
}
}
