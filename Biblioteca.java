import java.util.Map;
import java.util.*;

public class Teste{
	public static void main(String[] args){
		Map<Integer, String> mapa = new TreeMap<>();
		mapa.put(3, "Mensagem 03");
		mapa.put(2, "Mensagem 02");
		mapa.put(1, "Mensagem 01");

		Iterator<String> iter = mapa.values().iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}

		if(!mapa.isEmpty()){
			System.out.println("Chave     Valor");
			Set<Integer> chaves = mapa.keySet();
			for(Integer key : chaves ){
				String valor = mapa.get(key);
				System.out.println(" " +  key + " " + valor);
			}
		}


	}
}