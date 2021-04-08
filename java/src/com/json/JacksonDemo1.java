package com.json;

/***
    @created 16-03-21

    @ref: https://github.com/FasterXML/jackson-module-jsonSchema

    @ref: https://www.youtube.com/watch?v=xHwQNPGD9v8&t=5s

    @ref: https://stackoverflow.com/questions/14515994/convert-json-string-to-pretty-print-json-output-using-jackson (pretty print jackson)

    Generating a JSON Schema using Jackson from POJO


    cli single commanD: -classpath ".;C:\Users\lokeshwar.tailor\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.12.1\*"

    ##################################################################
    powershell setting env:
    
    javac -classpath $env:classpath 
    $env:classpath
    Remove-Item Env:classpath
    $env:classpath += ""        

    $env:classpath += ".;C:\Users\lokeshwar.tailor\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.12.1\*;"
    $env:classpath += "C:\Users\lokeshwar.tailor\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.12.1\*;"
    $env:classpath += "C:\Users\lokeshwar.tailor\.m2\repository\com\fasterxml\jackson\module\jackson-module-jsonSchema\2.12.1\*;"
    $env:classpath += "C:\Users\lokeshwar.tailor\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.12.1\*;"

    ##################################################################


    OUTPUT:

{
  "type" : "object",
  "id" : "urn:jsonschema:com:json:PojoForSchema",
  "properties" : {
    "name" : {
      "type" : "string",
      "required" : true,
      "description" : "name of the field & required"        
    },
    "nameLine2" : {
      "type" : "string",
      "required" : true,
      "description" : "nameline 2 of the field and required"
    },
    "description" : {
      "type" : "string"
    }
  }
}    

    
*/

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonMappingException;

import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;

import com.fasterxml.jackson.core.JsonProcessingException;


public class JacksonDemo1 {
    public static void main(String... args) {
        ObjectMapper mapper = new ObjectMapper();
        JsonSchemaGenerator generator = new JsonSchemaGenerator(mapper);

        JsonSchema schema = null;
        try {
             schema = generator.generateSchema(PojoForSchema.class);
        } catch(JsonMappingException ex) {
            ex.printStackTrace();
        }

        try {
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema));
        } catch(JsonProcessingException e) {
            e.printStackTrace();
        }
        
    }
}

class PojoForSchema {


    @JsonPropertyDescription(value = "id of the field")
    private long id;

    @JsonPropertyDescription(value = "name of the field & required")
    @JsonProperty(required=true)
    private String name;

    @JsonPropertyDescription(value = "nameline 2 of the field and required")
    @JsonProperty(required=true)
    private String nameLine2;

    @JsonProperty("description")
    private String desc; 

    private boolean enabled;
}