<script setup>
// ACA VA SOLO JS, porq estamos en <SCRIPT>
import NavBar from "./components/NavBar.vue";
</script>

<template>
  <!-- en TEMPLATE va solo el HTML -->
  <header>
    <!-- BARRA DE NAVEGACION -->
    <NavBar/>
  </header>  
  <main>
    <section id="educacion"><h2>Educacion - Cursos</h2></section>
    <section id="experiencia"><h2>Experiencia</h2></section>
    <section id="proyectos"><h2>Proyectos</h2></section>
    <section id="habilidades"><h2>Habilidades</h2></section>
    <section id="intereses"><h2>Intereses</h2></section>
  </main>
  
</template>

<style scoped>
/* ACA SOLO CSS, porq estmos en <STYLE> */

</style>
