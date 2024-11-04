
## 📱 Contact Manager App 
Una aplicación para gestionar contactos personales, desarrollada en Kotlin usando Jetpack Compose y Room para el almacenamiento local. 
Incluye funcionalidades para agregar, editar y eliminar contactos, junto con la opción de asignar una imagen desde la galería o por URL.

## 📋 Características
- Agregar Contactos 📝: Permite añadir un nuevo contacto con detalles como nombre, teléfono, correo y fecha de nacimiento. Además, puedes agregar una imagen desde la galería.
- Editar Contactos ✏️: Permite modificar los detalles de un contacto existente, conservando la información anterior.
- Eliminar Contactos ❌: Opción para eliminar contactos de la lista.
- Persistencia Local 💾: Usa Room para almacenar datos localmente.
- Visualización de Imágenes 🖼️: Los contactos pueden tener imágenes de perfil guardadas desde la galería o mediante URL.


## 🛠️ Tecnologías Utilizadas
- Kotlin
- Jetpack Compose
- Room Database
- Dagger Hilt
- Coil
- 
## 🚀 Instalación
1.- Clona el repositorio:
git clone https://github.com/Danny3431/M6_BACKENDKOTLIN


2.- Abre el proyecto en Android Studio.

3.- Sincroniza las dependencias y ejecuta el proyecto en un emulador o dispositivo físico.

## 📂 Estructura del Proyecto
```
app
└── src
    ├── main
    │   ├── java
    │   │   └── cl.bootcamp.m6_backendkotlin
    │   │       ├── model            # Modelo de datos (Contact)
    │   │       ├── view             # Pantallas principales (AddContactView, EditContactView, HomeView)
    │   │       ├── viewmodel        # Lógica de ViewModel (ContactViewModel)
    │   │       ├── repository       # ContactRepository para manejar operaciones de datos
    │   │       └── room             # Base de datos y DAO (ContactDao, ContactDatabase)
    │   └── res                      # Recursos UI (layouts, icons, etc.)
```
            

## 📱 Pantallas

HomeView
- Muestra la lista de contactos almacenados.
- Acceso a funciones de agregar, editar y eliminar.

AddContactView
- Permite agregar un nuevo contacto con todos sus detalles.
- Opción de seleccionar imagen desde galería o ingresar URL.

EditContactView
- Permite editar los detalles de un contacto existente.
- La imagen de perfil se puede cambiar, manteniendo los demás datos si es necesario.


🧩 Contribuciones
Las contribuciones son bienvenidas. Por favor, abre un issue o un pull request para mejorar la aplicación.



