import java.util.*;

// Clase Usuario
class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private int telefono;
    private String contraseña;
    private String rol;
    private boolean autenticacionDosFactores;

    public Usuario(String nombre, String apellido, String correo, int telefono, String contraseña, String rol, boolean autenticacionDosFactores) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.rol = rol;
        this.autenticacionDosFactores = autenticacionDosFactores;
    }

    public boolean iniciarSesion(String correo, String contraseña) {
        return this.correo.equals(correo) && this.contraseña.equals(contraseña);
    }

    public boolean crearCuenta() {
        // Lógica para crear una cuenta
        return true;
    }

    // Getters y setters
}

// Subclase Estudiante
class Estudiante extends Usuario {
    private List<Curso> cursosInscritos;
    private List<Tarea> tareasEnviadas;
    private List<Calificacion> calificacionesRecibidas;
    private List<PublicacionForo> foroPublicaciones;

    public Estudiante(String nombre, String apellido, String correo, int telefono, String contraseña, boolean autenticacionDosFactores) {
        super(nombre, apellido, correo, telefono, contraseña, "Estudiante", autenticacionDosFactores);
        this.cursosInscritos = new ArrayList<>();
        this.tareasEnviadas = new ArrayList<>();
        this.calificacionesRecibidas = new ArrayList<>();
        this.foroPublicaciones = new ArrayList<>();
    }

    public boolean enviarTarea(Tarea tarea) {
        // Lógica para enviar una tarea
        return true;
    }

    public boolean recibirCalificacion(Calificacion calificacion) {
        // Lógica para recibir una calificación
        return true;
    }

    public boolean publicarEnForo(PublicacionForo publicacion) {
        // Lógica para publicar en el foro
        return true;
    }
}

// Subclase Profesor
class Profesor extends Usuario {
    private List<Curso> cursosImpartidos;
    private List<Tarea> tareasAsignadas;
    private List<Calificacion> calificacionesPublicadas;
    private List<PublicacionForo> foroPublicaciones;

    public Profesor(String nombre, String apellido, String correo, int telefono, String contraseña, boolean autenticacionDosFactores) {
        super(nombre, apellido, correo, telefono, contraseña, "Profesor", autenticacionDosFactores);
        this.cursosImpartidos = new ArrayList<>();
        this.tareasAsignadas = new ArrayList<>();
        this.calificacionesPublicadas = new ArrayList<>();
        this.foroPublicaciones = new ArrayList<>();
    }

    public boolean asignarTarea(Tarea tarea, List<Estudiante> estudiantes) {
        // Lógica para asignar una tarea
        return true;
    }

    public boolean publicarCalificacion(Calificacion calificacion, List<Estudiante> estudiantes) {
        // Lógica para publicar una calificación
        return true;
    }

    public boolean publicarEnForo(PublicacionForo publicacion) {
        // Lógica para publicar en el foro
        return true;
    }
}

// Clase Curso
class Curso {
    private String nombre;
    private String codigo;
    private List<MaterialEstudio> materialesEstudio;
    private List<Tarea> tareas;
    private List<Examen> examenes;
    private List<ClaseStreaming> clasesStreaming;
    private Foro foro;

    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.materialesEstudio = new ArrayList<>();
        this.tareas = new ArrayList<>();
        this.examenes = new ArrayList<>();
        this.clasesStreaming = new ArrayList<>();
        this.foro = new Foro();
    }

    public boolean añadirMaterialEstudio(MaterialEstudio material) {
        // Lógica para añadir material de estudio
        return this.materialesEstudio.add(material);
    }

    public boolean añadirTarea(Tarea tarea) {
        // Lógica para añadir una tarea
        return this.tareas.add(tarea);
    }

    public boolean añadirExamen(Examen examen) {
        // Lógica para añadir un examen
        return this.examenes.add(examen);
    }

    public boolean añadirClaseStreaming(ClaseStreaming clase) {
        // Lógica para añadir una clase en streaming
        return this.clasesStreaming.add(clase);
    }
}

// Clase MaterialEstudio
class MaterialEstudio {
    private String nombre;
    private String tipo;
    private String url;

    public MaterialEstudio(String nombre, String tipo, String url) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.url = url;
    }

    // Getters y setters
}

// Clase Foro
class Foro {
    private Usuario autor;
    private String contenido;
    private Date fechaPublicacion;
    private List<Comentario> comentarios;

    public Foro() {
        this.comentarios = new ArrayList<>();
    }

    public boolean añadirComentario(Comentario comentario) {
        // Lógica para añadir un comentario al foro
        return this.comentarios.add(comentario);
    }
}

// Clase Comentario
class Comentario {
    private Usuario autor;
    private String contenido;
    private Date fechaPublicacion;

    public Comentario(Usuario autor, String contenido) {
        this.autor = autor;
        this.contenido = contenido;
        this.fechaPublicacion = new Date();
    }
}

// Otras clases según sea necesario: Tarea, Calificacion, Examen, ClaseStreaming, etc.
