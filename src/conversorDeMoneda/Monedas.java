package conversorDeMoneda;

import javax.swing.JOptionPane;

public class Monedas {
	public static void main(String[] args) {
		double variante = 0;
		int salida = 0;
		do {
			try {
				String[] opciones = { "conv de monedas", "conversor de kilometros" };
				String n = (String) JOptionPane.showInputDialog(null, "elija el conversor", "conversor",
						JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				if (n.equalsIgnoreCase("conv de monedas")) {
					double monto = Double.parseDouble(JOptionPane.showInputDialog("ingrese el monto a cambiar"));
					double montoCambiado = 0.00;
					String[] cambios = { "de Dólar a peso", "de peso a dolar", "de Euros a pesos", "de pesos a euros",
							"de Libras Esterlinas a pesos", "de pesos a libras esterlinas", "de Yen Japonés a pesos",
							"de pesos a yen", "de Won sul-coreano a pesos", "de pesos a coreanos" };
					String mon = (String) JOptionPane.showInputDialog(null, "elija el cambio a realizar", "cambio",
							JOptionPane.QUESTION_MESSAGE, null, cambios, cambios[0]);
					if (mon.equalsIgnoreCase(cambios[0])) {
						montoCambiado = monto * 377;
						JOptionPane.showMessageDialog(null, "son " + montoCambiado + " pesos");
					} else if (mon.equalsIgnoreCase(cambios[1])) {
						montoCambiado = +monto / 377;
						JOptionPane.showMessageDialog(null, "son " + montoCambiado + " dolares");

					} else if (mon.equalsIgnoreCase(cambios[2])) {
						montoCambiado = monto * 400;
						JOptionPane.showMessageDialog(null, "son " + montoCambiado + " pesos");

					} else if (mon.equalsIgnoreCase(cambios[3])) {
						montoCambiado = monto / 400;
						JOptionPane.showMessageDialog(null, "son " + montoCambiado + " euros");

					} else if (mon.equalsIgnoreCase(cambios[4])) {
						montoCambiado = monto * 234.77;
						JOptionPane.showMessageDialog(null, "son " + montoCambiado + " pesos");

					} else if (mon.equalsIgnoreCase(cambios[5])) {
						montoCambiado = monto / 234.77;
						JOptionPane.showMessageDialog(null, "son " + montoCambiado + " libras esterlinas");

					} else if (mon.equalsIgnoreCase(cambios[6])) {
						montoCambiado = monto * 1.44;
						JOptionPane.showMessageDialog(null, "son " + montoCambiado + " pesos");

					} else if (mon.equalsIgnoreCase(cambios[7])) {
						montoCambiado = monto / 1.44;
						JOptionPane.showMessageDialog(null, "son " + montoCambiado + " yen");

					} else if (mon.equalsIgnoreCase(cambios[8])) {
						montoCambiado = monto / 6.64;
						JOptionPane.showMessageDialog(null, "son " + montoCambiado + " pesos");

					} else if (mon.equalsIgnoreCase(cambios[9])) {
						montoCambiado = monto * 6.64;
						JOptionPane.showMessageDialog(null, "son " + montoCambiado + " won-sul coreano");

					}

				} else {
					double dist = Double.parseDouble(JOptionPane.showInputDialog("ingrese los kilometros a convertir"));
					double distanciaCambiada = 0.00;
					String[] kilometros = { "pasar a metros", "pasar a centimetros", "pasar a milimetros" };
					String distancia = (String) JOptionPane.showInputDialog(null, "elija el cambio a realizar",
							"cambio", JOptionPane.QUESTION_MESSAGE, null, kilometros, kilometros[0]);
					if (distancia.equalsIgnoreCase(kilometros[0])) {
						distanciaCambiada = dist * 1000;
						JOptionPane.showMessageDialog(null, "son " + distanciaCambiada + " metros");
					} else if (distancia.equalsIgnoreCase(kilometros[1])) {
						distanciaCambiada = dist * 100000;
						JOptionPane.showMessageDialog(null, "son " + distanciaCambiada + " centimetros");

					} else if (distancia.equalsIgnoreCase(kilometros[2])) {
						distanciaCambiada = dist * 1000000;
						JOptionPane.showMessageDialog(null, "son " + distanciaCambiada + " milimetros");

					}
				}

				// JOptionPane.showConfirmDialog(null," desea volver al menu?")= si presionas si
				// es = 0,si presionas no es = 1,si presionas cancelar es = 2
				salida = JOptionPane.showConfirmDialog(null, " desea volver al menu?");

			} catch (Exception e) {
				salida = JOptionPane.showConfirmDialog(null,
						"ud ha decidido cancelar la operacion, desea volver al menu?");
			}
		} while (salida == 0);

		JOptionPane.showMessageDialog(null, "salir");

	}

}

