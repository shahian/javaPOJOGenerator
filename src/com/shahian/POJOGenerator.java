package com.shahian;

import java.util.List;

/**
 This is a Java class that contains a static method named generatePOJO that takes three parameters:
 */
public class POJOGenerator {

    public static String generatePOJO(String className, List<String> fieldNames, List<String> fieldTypes) {
        StringBuilder sb = new StringBuilder();
        sb.append("public class ").append(className).append(" {\n\n");

        // Generate fields
        for (int i = 0; i < fieldNames.size(); i++) {
            sb.append("  private ").append(fieldTypes.get(i)).append(" ").append(fieldNames.get(i)).append(";\n");
        }
        sb.append("\n");
        // Generate constructors
        sb.append("  public ").append(className).append("() {}\n\n");
        sb.append("  public ").append(className).append("(");
        for (int i = 0; i < fieldNames.size(); i++) {
            sb.append(fieldTypes.get(i)).append(" ").append(fieldNames.get(i));
            if (i < fieldNames.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(") {\n");
        for (String fieldName : fieldNames) {
            sb.append("    this.").append(fieldName).append(" = ").append(fieldName).append(";\n");
        }
        sb.append("  }\n\n");
        // Generate getters and setters
        for (int i = 0; i < fieldNames.size(); i++) {
            String fieldName = fieldNames.get(i);
            String fieldType = fieldTypes.get(i);
            String capitalizedFieldName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            sb.append("  public ").append(fieldType).append(" get").append(capitalizedFieldName).append("() {\n");
            sb.append("    return ").append(fieldName).append(";\n");
            sb.append("  }\n\n");
            sb.append("  public void set").append(capitalizedFieldName).append("(").append(fieldType).append(" ").append(fieldName).append(") {\n");
            sb.append("    this.").append(fieldName).append(" = ").append(fieldName).append(";\n");
            sb.append("  }\n\n");
        }
        sb.append("}");
        return sb.toString();
    }
}