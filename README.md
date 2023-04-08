# javaPOJOGenerator
This is a Java class that contains a static method named generatePOJO that takes three parameters:

className: A String representing the name of the POJO class to be generated.

fieldNames: A List of Strings representing the names of the fields to be included in the POJO class.

fieldTypes: A List of Strings representing the types of the fields to be included in the POJO class.

The method returns a String that represents the complete source code of the generated POJO class.

The method first creates a StringBuilder object sb to store the source code of the POJO class. It then appends the class declaration with the specified class name to sb and starts the class body with two new lines.

Next, the method generates the private fields of the POJO class based on the fieldNames and fieldTypes lists. For each field, the method appends a line to sb that declares a private field with the field type and name.

After generating the private fields, the method generates two constructors for the POJO class. The first constructor is a default constructor with an empty body. The second constructor takes arguments for each of the fields and sets the corresponding private fields. The method generates the signature of the second constructor based on the fieldNames and fieldTypes lists, and then generates a body that assigns each argument to its corresponding private field using this.fieldName = fieldName;.

Finally, the method generates the getter and setter methods for each field. For each field, the method generates a getter method that returns the value of the private field and a setter method that sets the value of the private field to the specified argument. The method generates the method names based on the field names and types, and the method signatures based on the corresponding field types and names.

Once all of the fields, constructors, getters, and setters have been generated, the method appends the closing brace to sb and returns the complete source code of the POJO class as a String.
