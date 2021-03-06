package org.drools.workshop.endpoint.api;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.drools.workshop.model.*;

@Path("alumnos")
public interface AlumnoService{
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/inserta")
    public Alumno insertaAlumno(@NotNull Alumno alumno);
    
        
    @GET
    @Produces("application/json")
    @Path("/")
    public List<Alumno> getAlumnos();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaAlumnoAsignatura")
    public AlumnoAsignatura insertaAlumnoAsignatura(@NotNull AlumnoAsignatura alumnoAsignatura);
    
        
    @GET
    @Produces("application/json")
    @Path("/alumnoasignaturas")
    public List<AlumnoAsignatura> getAlumnoAsignaturas();



    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaAlumnoEjercicio")
    public AlumnoEjercicio insertaAlumnoEjercicio(@NotNull AlumnoEjercicio  alumnoEjercicio);
    
        
    @GET
    @Produces("application/json")
    @Path("/alumnoejercicios")
    public List<AlumnoEjercicio> getAlumnoEjercicios();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaAsignaturaEjercicio")
    public AsignaturaEjercicio insertaAsignaturaEjercicio(@NotNull AsignaturaEjercicio asignaturaEjercicio);
    
        
    @GET
    @Produces("application/json")
    @Path("/asignaturasejercicios")
    public List<AsignaturaEjercicio> getAsignaturaEjercicios();

    @GET
    @Produces("application/json")
    @Path("recomendaciones")
    public List<Recomendacion> getRecomendaciones();

      @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaAsignatura")
    public Asignatura insertaAsignatura(@NotNull Asignatura asignatura);
    
    @GET
    @Produces("application/json")
    @Path("/asignaturas")
    public List<Asignatura> getAsignatura();

     @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaEjercicio")
    public Ejercicio insertaEjercicio(@NotNull Ejercicio ejercicio);
    
        
    @GET
    @Produces("application/json")
    @Path("/ejercicios")
    public List<Ejercicio> getEjercicios();
   
}
