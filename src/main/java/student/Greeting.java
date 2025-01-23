package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc.
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 */
public class Greeting {

    /** int value of localityID.*/
    private int localityID;

    /** holds the localityName.*/
    private String localityName;

    /** holds the asciiGreeting.*/
    private String asciiGreeting;

    /** holds the unicodeGreeting.*/
    private String unicodeGreeting;

    /** holds the formatStr.*/
    private String formatStr;

    /**
     * This is a constructor for the Greeting class.
     * @param localityID the locality ID of the person to greet
     * @param localityName the localityName of the person to greet
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello",
                "Hello", "%s, %%s!");
    }

    /**
     * This is a constructor for the Greeting class.
     * @param localityID the locality ID of the person to greet
     * @param localityName the localityName of the person to greet
     * @param greeting the greeting for the person
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName,
                greeting, greeting, "%s, %%s!");
    }

    /**
     * This is a constructor for the Greeting class.
     * @param localityID the locality ID of the person to greet
     * @param localityName the localityName of the person to greet
     * @param asciiGreeting the asciiGreeting for the person
     * @param unicodeGreeting the unicodeGreeting for the person
     * @param formatStr the formatStr for the person
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Returns the locality id number.
     * @return the locality id number
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * Returns the locality name.
     * @return the locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Returns the ascii greeting. Just the greeting, no formatting.
     * @return the ascii greeting
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * Returns the unicode greeting. Just the greeting, no formatting.
     * @return the unicode greeting
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /** Gets the unicode format string.
     * This string will have a %s,so that the name can be inserted into the greeting in the correct location.
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr() {
        return String.format(formatStr, unicodeGreeting);
    }

    /**
     * Returns the format string with the greeting inserted into the format.
     * This string will have a %s, so that the name can be inserted into the greeting in the correct location.
     * @param asciiOnly if true, only ascii characters will be used
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            return String.format(formatStr, asciiGreeting);
        } else {
            return String.format(formatStr, unicodeGreeting);
        }
    }

    /**
     * Returns the full greeting details as a string. Primarily for debugging purposes.
     * @return the full greeting details as a string
     */
    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}
