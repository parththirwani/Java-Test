package Mod1.DataTypes;

class DefaultValue {
    
    byte defaultByte;
    short defaultShort;
    long defaultLong;
    int defaultInt;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    public void printDefaults() {
        System.out.println("Default byte: " + defaultByte);
        System.out.println("Default short: " + defaultShort);
        System.out.println("Default int: " + defaultInt);
        System.out.println("Default long: " + defaultLong);
        System.out.println("Default float: " + defaultFloat);
        System.out.println("Default double: " + defaultDouble);
        System.out.println("Default char: '" + defaultChar + "'");
        System.out.println("Default boolean: " + defaultBoolean);
    }
    public class DefaultValueGenerator{
        public static void main(String[] args) {
            DefaultValue defaultValue = new DefaultValue();
            defaultValue.printDefaults();
        }
    }
}