import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DatosPrimitivos_One {
	public static void main(String[] args) throws IOException {
		DataInputStream lectura = new DataInputStream (new FileInputStream("resources/files/datos.dat"));
		try {
			while (true){
				String nomAux= lectura.readUTF();
				byte edAux = lectura.readByte();
				int slAux = lectura.readInt();
				double vtaAux = lectura.readDouble();
				System.out.println(nomAux+"/t"+edAux+"/t"+slAux+"/t"+vtaAux);
				
			}
		}catch(EOFException eof){
			System.out.println("****Fin Archivo***** ");
			lectura.close();

		}
	}
}