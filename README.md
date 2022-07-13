# Taller03-SOLID

1. Se incumple con el SRP debido a que la clase helado y pastel realizan el calculo de precios y generan la instancia del helado y pastel respectivamente, para corregir esto se implementa una clase padre Postre de donde las dos subclases heredan sus atributos y funciones compartidas. De tal forma que al final solo contamos con un constructor que hereda de la clase padre y el metodo toString.


2. OperacionesAderezo puede ser eliminada debido a que incumple con el OCP porque al tener un metodo por cada tipo de Objeto Postre habria que implementar nuevos metodos para estas nuevas clases. Y si se podria implementar estos metodos en la clase Postres para el cumplimiento de este principio, de esta forma al añadir estos metodos a la clase Postre nos aseguramos que las clases que hereden de esta clase Padre tengan acceso al metodo y no tener que repetirlo.


3. El cambio de la ecuacion en calcularPrecioFinal no afecta en ningun sentido al metodo showPrecioFinal por lo que no existen incumplimientos con el DIP.

