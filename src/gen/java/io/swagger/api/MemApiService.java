package io.swagger.api;

import io.swagger.api.*;


import org.glassfish.jersey.media.multipart.FormDataContentDisposition;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-06T15:45:07.597Z[GMT]")public abstract class MemApiService {
    public abstract Response storeData( @NotNull Integer value,SecurityContext securityContext) throws NotFoundException;
}
