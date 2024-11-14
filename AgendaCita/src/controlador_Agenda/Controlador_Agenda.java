package controlador_Agenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import agendaDAO.Agenda_DAO;
import agendaDTO.Agenda_DTO;
import vista_Agenda.Vista_Agenda;

public class Controlador_Agenda implements ActionListener {
    private Vista_Agenda vista;
    private Agenda_DAO modelo;

    public Controlador_Agenda(Vista_Agenda vista) {
        this.vista = vista;
        this.modelo = new Agenda_DAO();
        this.vista.getBtnAgregar().addActionListener(this);
        this.vista.getBtnEliminar().addActionListener(this);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getSource() == vista.getBtnAgregar()) {
            agregarCita();
        } else if (e.getSource() == vista.getBtnEliminar()) {
            eliminarCita();
        } else if (e.getSource() == vista.getBtnActualizar()) {
            actualizarCita();
        } 
    }

   
    private void agregarCita() {
        
        String odontologo = vista.getOdontologo();
        String mes = vista.getMes();
        String dia = vista.getDia();
        String hora = vista.getHora();
        String paciente = "Nombre del paciente"; 
        String consultorio = "Consultorio 1"; 

        
        int codigoCita = Integer.parseInt(vista.getCodigoCita());

       
        Agenda_DTO cita = new Agenda_DTO();
        cita.setOdontologo(odontologo);
        cita.setMes(mes);
        cita.setDia(Integer.parseInt(dia));
        cita.setHora(Integer.parseInt(hora));
        cita.setPaciente(paciente);
        cita.setConsultorio(consultorio);
        cita.setCodigoCita(codigoCita);

        
        boolean exito = modelo.create(cita);

        if (exito) {
            System.out.println("Cita agregada con éxito.");
        } else {
            System.out.println("Error al agregar la cita.");
        }
    }

   
    private void eliminarCita() {
        int codigoCita = Integer.parseInt(vista.getCodigoCita());
       
        boolean exito = modelo.delete(codigoCita);

        if (exito) {
            System.out.println("Cita eliminada con éxito.");
        } else {
            System.out.println("No se encontró la cita para eliminar.");
        }
    }

   
    private void actualizarCita() {
        int codigoCita = Integer.parseInt(vista.getCodigoCita());
        String odontologo = vista.getOdontologo();
        String mes = vista.getMes();
        String dia = vista.getDia();
        String hora = vista.getHora();
        String paciente = "Nombre del paciente"; 
        String consultorio = "Consultorio 1";  

        Agenda_DTO citaActualizada = new Agenda_DTO();
        citaActualizada.setCodigoCita(codigoCita);
        citaActualizada.setOdontologo(odontologo);
        citaActualizada.setMes(mes);
        citaActualizada.setDia(Integer.parseInt(dia));
        citaActualizada.setHora(Integer.parseInt(hora));
        citaActualizada.setPaciente(paciente);
        citaActualizada.setConsultorio(consultorio);

    
}
    }
