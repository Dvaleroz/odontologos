package agendaDAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import agendaDTO.Agenda_DTO;

public class Agenda_DAO {
    private ArrayList<Agenda_DTO> lista;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private String archivo;

    public Agenda_DAO() {
        this.archivo = "agenda.dat";
        File file = new File(archivo);
        if (file.isFile()) {
            try {
                this.entrada = new ObjectInputStream(new FileInputStream(archivo));
                this.lista = (ArrayList<Agenda_DTO>) entrada.readObject();
                this.entrada.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                guardar();
            }
        } else {
            lista = new ArrayList<>();
        }
    }

    public boolean create(Agenda_DTO cita) {
        lista.add(cita);
        guardar();
        return true;
    }

	public boolean delete(int codigoCita) {
		// TODO Auto-generated method stub
		return false;
	}
}
  
