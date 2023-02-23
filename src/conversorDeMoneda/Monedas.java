package conversorDeMoneda;

import javax.swing.JOptionPane;

public class Monedas {
	public static void main(String[] args) {
		double variante = 0;
		int salida = 0;
        do {
		String[] opciones = { "conv de monedas", "conversor de kilometros" };
		String n = (String) JOptionPane.showInputDialog(null, "elija el conversor", "conversor",
				JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		if (n.equalsIgnoreCase("conv de monedas")) {
			double monto = Double.parseDouble(JOptionPane.showInputDialog("ingrese el monto a cambiar"));

			String[] cambios = { "de Dólar a peso", "de peso a dolar", "de Euros a pesos", "de pesos a euros",
					"de Libras Esterlinas a pesos", "de pesos a libras esterlinas", "de Yen Japonés a pesos",
					"de pesos a yen", "de Won sul-coreano a pesos", "de pesos a coreanos" };
			String mon = (String) JOptionPane.showInputDialog(null, "elija el cambio a realizar", "cambio",
					JOptionPane.QUESTION_MESSAGE, null, cambios, cambios[0]);
			if(mon.equalsIgnoreCase(cambios[0]) ) {
				String montoCambiado = ""+monto*377;
				JOptionPane.showMessageDialog(null, "son " + montoCambiado + " pesos");
			}else if(mon.equalsIgnoreCase(cambios[1])){
			String montoCambiado = ""+monto/377;
				JOptionPane.showMessageDialog(null, "son " + montoCambiado + " dolares");
				
			}else if(mon.equalsIgnoreCase(cambios[2])){
			String montoCambiado = ""+monto*400;
				JOptionPane.showMessageDialog(null, "son " + montoCambiado + " pesos");
				
			}else if(mon.equalsIgnoreCase(cambios[3])){
			String montoCambiado = ""+monto/400;
				JOptionPane.showMessageDialog(null, "son " + montoCambiado + " euros");
				
			}else if(mon.equalsIgnoreCase(cambios[4])){
			String montoCambiado = ""+monto*234.77;
				JOptionPane.showMessageDialog(null, "son " + montoCambiado + " pesos");
				
			}else if(mon.equalsIgnoreCase(cambios[5])){
			String montoCambiado = ""+monto/234.77;
				JOptionPane.showMessageDialog(null, "son " + montoCambiado + " libras esterlinas");
				
			}else if(mon.equalsIgnoreCase(cambios[6])){
			String montoCambiado = ""+monto*1.44;
				JOptionPane.showMessageDialog(null, "son " + montoCambiado + " pesos");
				
			}else if(mon.equalsIgnoreCase(cambios[7])){
			String montoCambiado = ""+monto/1.44;
				JOptionPane.showMessageDialog(null, "son " + montoCambiado + " yen");
				
			}else if(mon.equalsIgnoreCase(cambios[8])){
			String montoCambiado = ""+monto/6.64;
				JOptionPane.showMessageDialog(null, "son " + montoCambiado + " pesos");
				
			}else if(mon.equalsIgnoreCase(cambios[9])){
			String montoCambiado = ""+monto*6.64;
				JOptionPane.showMessageDialog(null, "son " + montoCambiado + " won-sul coreano");
				
			}


		}else {
			double dist = Double.parseDouble(JOptionPane.showInputDialog("ingrese los kilometros a convertir"));

			String[] kilometros = { "pasar a metros", "pasar a centimetros", "pasar a milimetros" };
			String distancia = (String) JOptionPane.showInputDialog(null, "elija el cambio a realizar", "cambio",
					JOptionPane.QUESTION_MESSAGE, null, kilometros, kilometros[0]);
			if(distancia.equalsIgnoreCase(kilometros[0]) ) {
				String distanciaCambiada = ""+dist*1000;
				JOptionPane.showMessageDialog(null, "son " + distanciaCambiada + " metros");
			}else if(distancia.equalsIgnoreCase(kilometros[1])){
			String distanciaCambiada = ""+dist*100000;
				JOptionPane.showMessageDialog(null, "son " + distanciaCambiada + " centimetros");
				
			}else if(distancia.equalsIgnoreCase(kilometros[2])){
			String distanciaCambiada = ""+dist*1000000;
				JOptionPane.showMessageDialog(null, "son " + distanciaCambiada + " milimetros");
				
			}
		}
		 salida = JOptionPane.showConfirmDialog(null,"desea hacer mas cambios?");
		
        }while(salida==0);
		
        JOptionPane.showMessageDialog(null, "salir");
       
	}

}

