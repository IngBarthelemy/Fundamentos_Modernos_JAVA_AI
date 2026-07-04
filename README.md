 📅 Gestor de Reservas (Taller Integrador Módulo 1)

Aplicación de consola (CLI) desarrollada en **Java** como proyecto integrador del Módulo 1.  
Este sistema simula la gestión de reservas para una peluquería, aplicando los fundamentos de programación: variables, condicionales, ciclos, métodos, arreglos y validación de datos.

---

🎯 Descripción del problema

El sistema simula el caso de **“Marta Peluquería”**, donde las reservas se gestionan manualmente en papel, lo que genera problemas como:

- Doble reserva en la misma hora
- Falta de control de citas disponibles
- Errores en el cálculo de ingresos diarios

Este programa digitaliza el proceso para evitar estos problemas.

---

🧠 Objetivo del proyecto

Construir una aplicación en consola que permita:

- Gestionar reservas del día
- Controlar horarios disponibles
- Validar entradas del usuario
- Calcular ingresos del día
- Practicar programación estructurada en Java

---

⚙️ Funcionalidades

 📌 Gestión de reservas
- Agendar una reserva (cliente, hora y servicio)
- Listar todas las reservas
- Cancelar una reserva existente

📊 Reportes
- Total de citas del día
- Dinero facturado

🧾 Validaciones
- Horarios entre 8:00 y 17:00
- No duplicar horas
- Nombre obligatorio
- Servicio válido (1, 2 o 3)
- Cupo máximo de reservas

---

💇 Servicios disponibles

| Código | Servicio          | Precio  |
|--------|------------------|---------|
| 1      | Corte de cabello | $25.000 |
| 2      | Tinte            | $60.000 |
| 3      | Manicure         | $30.000 |

---

🏗️ Arquitectura del proyecto

| Clase | Responsabilidad |
|------|----------------|
| `App.java` | Punto de entrada y menú principal |
| `Menu.java` | Interacción con el usuario (mostrar y leer opciones) |
| `Validador.java` | Validación de datos (hora, nombre, servicio, etc.) |
| `Operaciones.java` | Lógica del sistema (reservas, cancelaciones, reportes) |

---

🧩 Estructura de datos

Se utilizan **arreglos paralelos**:

```java
clientes[i]  → nombre del cliente
horas[i]     → hora de la reserva
servicios[i] → tipo de servicio
