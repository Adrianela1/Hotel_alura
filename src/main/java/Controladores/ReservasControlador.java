package Controladores;

import DAO.ReservasDAO;
import modelo.Reservas;

import java.time.LocalDate;
import java.util.List;

public class ReservasControlador {

    private ReservasDAO reservasDAO;

    public ReservasControlador() {
        super();
        this.reservasDAO = reservasDAO;
    }

    public void guardar(Reservas reservas) {
        this.reservasDAO.guardar(reservas);
    }

    public List<Reservas> mostrar() {
        return this.reservasDAO.mostrar();
    }

    public List<Reservas> buscar(String id) {
        return this.reservasDAO.buscarId(id);
    }

    public void actualizarReserva(LocalDate dataE, LocalDate dataS, String valor, String formaPago, Integer id)  {
        this.reservasDAO.Actualizar(dataE, dataS, valor, formaPago, id);
    }

    public void Eliminar(Integer id) {
        this.reservasDAO.Eliminar(id);
    }

}
