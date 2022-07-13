# Taller03-SOLID

1. Se incumple con el SRP debido a que la clase helado y pastel realizan el calculo de precios y generan la instancia del helado y pastel respectivamente, para corregir esto se implementa una clase padre Postre de donde las dos subclases heredan sus atributos y funciones compartidas, ademas una interfaz FinalPriceCalculable y luego implementar esta en la clase padre Postre. De tal forma que al final solo contamos con un constructor que hereda de la clase padre y el metodo toString.
