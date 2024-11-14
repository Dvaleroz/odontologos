package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import dto.Historia_clinica;

public class Historia_clinicaDao {
    private ArrayList<Historia_clinica> lista;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private String archivo;

    public Historia_clinicaDao() {
        this.archivo = "agenda.dat";
        File file = new File(archivo);
        if (file.isFile()) {
            try {
                this.entrada = new ObjectInputStream(new FileInputStream(archivo));
                this.lista = (ArrayList<Historia_clinica>) entrada.readObject();
                this.entrada.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                guardar();
            }
        } else {
            lista = new ArrayList<>();
        }
    }

    public boolean create(Historia_clinica HistoriaClinica) {
        lista.add(HistoriaClinica);
        guardar();
        return true;
    }

 public void guardar() {
	 try {
		 this.salida = new ObjectOutputStream(new FileOutputStream(archivo));
		 this.salida.writeObject(lista);
		 this.salida.close();
	 }catch(Exception e) {
		 System.out.println(e.getMessage())
	 }
 }
}
  