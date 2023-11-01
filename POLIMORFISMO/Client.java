
package inhiretance;

import java.util.Date;

public class Client extends Person{
    private int idCliente;
    private Date fechaRegsitro;
    private boolean vip;
    private static int contadorCliente;            

    public Client(Date fechaRegsitro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = idCliente;
        this.fechaRegsitro = fechaRegsitro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegsitro() {
        return fechaRegsitro;
    }

    public void setFechaRegsitro(Date fechaRegsitro) {
        this.fechaRegsitro = fechaRegsitro;
    }

 public boolean isVip() {
        return vip;
    }
    
    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    @Override
    public String obtenerDetalle(){
        return super.obtenerDetalle() + "Es VIP: " + this.vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegsitro=").append(fechaRegsitro);
        sb.append(", direccion=").append(direccion);
        sb.append(", vip=").append(vip);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
