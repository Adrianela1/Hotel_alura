package Controladores;

import DAO.HuespedesDAO;
import Factory.ConexionBase;
import modelo.Huespedes;

import java.sql.Connection;
import java.util.List;


public class HuespedesControlador {

    private HuespedesDAO huespedesDAO;

    public HuespedesControlador() {
        Connection con = new ConexionBase().connectionBase();
        this.huespedesDAO = new HuespedesDAO(con);
    }

    public void guardar(Huespedes huespedes) {
        this.huespedesDAO.guardar(huespedes);
    }

    public List<Huespedes> mostrarHuesped() {
        return this.huespedesDAO.mostrar();
    }

    public List<Huespedes> buscarHuesped(String id) {
        return this.huespedesDAO.buscarId(id);
    }

}
