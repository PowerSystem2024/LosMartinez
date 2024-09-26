<template>
    <nav class="navbar">
        <div class="navbar-menu">
            <ul>
                <a v-for="nav in navegacion" :key="nav.nombre" :href="nav.enlace" class="navbar-item" >{{nav.nombre}}</a>  
            </ul>
        </div>
</nav>

</template>

<script setup>
import { ref } from 'vue';
const navegacion= ref([
    {id:1, nombre:'Educación', enlace:'#educacion'},
    {id:2, nombre:'Experiencia', enlace:'#experiencia'},
    {id:3, nombre:'Proyectos', enlace:'#proyectos'},
    {id:4, nombre:'Habilidades', enlace:'#habilidades'}
]);
</script>

<style scoped>

.navbar {
    background-color:var(--vt-c-indigo);
    color: #fff;
    padding: 0.5rem 1rem;
    align-items: center;
  }
.navbar-item {
    color: #fff;
    text-decoration: none;
    margin-right: 1rem;
}
.navbar-menu {
  display: flex;
  justify-content: flex-end;
}
.nav-list{
  list-style: none;
}

a {
    border: 1px solid; /* Añade un borde sólido de 1px */
    border-color: hsla(160, 100%, 37%, 0.2); /* Define el color del borde usando hsla */
    border-radius: 5px; /* Redondea las esquinas del borde */
    text-decoration: none; /* Elimina el subrayado de los enlaces */
    transition: 0.4s; /* Añade una transición suave de 0.4s para los cambios de estilo */
    padding: 5px; /* Añade un padding de 5px alrededor del contenido */
}

a:hover {
    background-color: hsla(160, 100%, 37%, 0.2); /* Cambia el color de fondo al pasar el mouse sobre un enlace */
}

@media (max-width: 768px) {
  .navbar-menu {
    display: flex; /* Organiza los elementos en línea usando flexbox */
    justify-content: flex-end; /* Alinea los elementos al final de la navbar */
    width: 100%; /* Asegura que la navbar ocupe el 100% del ancho en pantallas pequeñas */
  }
}
</style>