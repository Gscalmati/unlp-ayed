package tp06.ejercicio5;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp06.clase911.Recorridos;
import tp06.ejercicio3.Grafo;
import tp06.ejercicio3.GrafoImplListAdy;
import tp06.ejercicio3.Vertice;
import tp06.ejercicio3.VerticeImplListAdy;

public class TestMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grafo <String> grafo = new GrafoImplListAdy<String> ();
		
		Vertice <String> v1 = new VerticeImplListAdy<String>("La Plata");
		Vertice <String> v2 = new VerticeImplListAdy<String>("Berisso");
		Vertice <String> v3 = new VerticeImplListAdy<String>("Ensenada");
		Vertice <String> v4 = new VerticeImplListAdy<String>("City Bell");
		Vertice <String> v5 = new VerticeImplListAdy<String>("Villa Elisa");
		Vertice <String> v6 = new VerticeImplListAdy<String>("Los Hornos");
		Vertice <String> v7 = new VerticeImplListAdy<String>("San Carlos");
		Vertice <String> v8 = new VerticeImplListAdy<String>("Tolosa");
		
		grafo.agregarVertice(v1);
		grafo.agregarVertice(v2);
		grafo.agregarVertice(v3);
		grafo.agregarVertice(v4);
		grafo.agregarVertice(v5);
		grafo.agregarVertice(v6);
		grafo.agregarVertice(v7);
		grafo.agregarVertice(v8);
		
		grafo.conectar(v1, v2, 5);
		grafo.conectar(v1, v3, 7);
		grafo.conectar(v1, v6, 3);
		grafo.conectar(v1, v7, 3);
		grafo.conectar(v1, v8, 2);
		
		grafo.conectar(v2, v1, 5);
		grafo.conectar(v2, v3, 4);
		
		grafo.conectar(v3, v1, 7);
		grafo.conectar(v3, v2, 4);
		
		grafo.conectar(v4, v5, 4);
		grafo.conectar(v4, v7, 6);
		grafo.conectar(v4, v8, 5);
		
		grafo.conectar(v5, v4, 4);
		
		grafo.conectar(v6, v1, 3);
		grafo.conectar(v6, v7, 1);
		
		grafo.conectar(v7, v1, 3);
		grafo.conectar(v7, v4, 6);
		grafo.conectar(v7, v6, 1);
		
		grafo.conectar(v8, v1, 2);
		grafo.conectar(v8, v4, 5);
		
		//MapaConDFS mapa = new MapaConDFS();
		Mapa mapa = new Mapa();
		mapa.setMapaCiudades(grafo);
		
		ListaGenerica<String> camino;
		
		// Inciso A
		//camino = mapa.devolverCamino("Los Hornos", "Villa Elisa");
		
		// Inciso B
//		ListaGenerica<String> excepciones = new ListaEnlazadaGenerica<String>();
//		excepciones.agregarFinal("Punta Lara");
//		excepciones.agregarFinal("Tolosa");
//		excepciones.agregarFinal("Los Hornos");
//		//excepciones.agregarFinal("City Bell");
//		camino = mapa.devolverCaminoExceptuando("Ensenada", "Villa Elisa", excepciones);
		
		// Inciso C
		
//		camino = mapa.devolverCaminoMasCorto ("Ensenada", "Villa Elisa");
//		System.out.println(camino.tamanio());
		
		// Inciso D
		
//		camino = mapa.caminoSinCargarCombustible("La Plata", "City Bell", 3);
		
		// Inciso E
		
		camino = mapa.caminoConMenorCargaCombustible("La Plata", "Villa Elisa", 50);
		
		System.out.println("------------------------------------");
		camino.comenzar();
		while(!camino.fin()) {
			System.out.println(camino.proximo());
		}
		
		
	}

}
