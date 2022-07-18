package academy.devdojo.springboot2.exception;

import com.sun.xml.bind.v2.runtime.property.StructureLoaderBuilder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ValidationexceptionDetails extends ExceptionDetails{
    private final String fields;
    private final String fieldsMessage;
}
