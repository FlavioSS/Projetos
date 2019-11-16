
public class MySQL implements IDb {

	@Override
	public void conectar() {
		System.out.println("Conetado ao MySQL");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectado do MySQL");
		
	}

}
