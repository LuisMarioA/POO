package Fuentes;
public class Banco {
    private Cliente clientes [];
    private int numClientes;

    public Banco() {
        clientes = new Cliente[5];
        numClientes=0;
    }

    public void eliminarCliente(int index){
        if(index>numClientes){
            System.out.println("El cliente que deseas eliminar no existe");
        }else{
            for(int i=index;i<numClientes;i++){
                clientes[i-1]=clientes[i];
            }
            numClientes--;
        }
    }
    
   /* public void agregarCliente(String nom,String numCuenta) {
        for (int i = 0; i < numClientes; i++) {
            Cliente cliente = clientes[i];
            if(numCuenta.equals(clientes[i].obtenerNumCuenta())){
                System.out.println("Numero de cuenta existente");
                return;
            }
        }
        if(numClientes==clientes.length){
            System.out.println("Capacidad del banco llena");
        }else{
            clientes[numClientes]=new Cliente(nom);

            Cuenta cuenta=new Cuenta(50000);
            clientes[numClientes].establecerCuenta(cuenta);
            numClientes++;
        }  
    }

    public int obtenerNumClientes() {
        return numClientes;
    }

    public Cliente obtenerClientes(int indice) {
        Cliente cliente = clientes[indice];
        return cliente;
    }
    
    public void imprimirClientes(){
        for (int i = 0; i < numClientes; i++) {
            Cliente cliente = clientes[i];
            System.out.println("Cliente " + (i+1) +" Nombre: "+ cliente.obtenerNombre()
                    + " Saldo: "+cliente.obtenerCuenta().consultar()
                    +" Numero de Cuenta: "+ cliente.obtenerNumCuenta());
        }
    }
*/
}
