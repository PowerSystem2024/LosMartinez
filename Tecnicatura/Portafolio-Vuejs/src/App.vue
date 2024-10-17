<script setup>
// ACA VA SOLO JS, porq estamos en <SCRIPT>
import NavBar from "./components/NavBar.vue";
import DatosPersonales from "./components/DatosPersonales.vue"
import Educacion from "./components/EducacionComponente.vue"
import Experiencia from "./components/ExperienciaComponente.vue"
import Proyectos from "./components/ProyectosComponente.vue"
import Habilidades from "./components/HabilidadesComponente.vue"
import Intereses from "./components/InteresesComponente.vue"

</script>

<template>
  <!-- en TEMPLATE va solo el HTML -->
  <header id="top">
    <!-- BARRA DE NAVEGACION -->
    <NavBar/>
    <DatosPersonales/>
  </header>  
  <main>
    <!--El estilo CSS de section se encuentra en base.css -->
    <section id="educacion">
      <h2>Educacion - Cursos</h2>
      <Educacion/>
    </section>
    <section id="experiencia">
      <h2>Experiencia</h2>
      <Experiencia/>
    </section>
    <section id="proyectos">
      <h2>Proyectos</h2>
      <Proyectos/>
    </section>
    <section id="habilidades">
      <h2>Habilidades</h2>
      <!-- Componente habilidades -->
       <Habilidades/>
    </section>
    <section id="intereses"><h2>Intereses</h2>
      <!-- Componente intereses -->
       <Intereses/>
    </section>
  </main>
  <footer>
    <a href="#top">Inicio</a>
    <p>@ 2024 Alejandro Martinez - Portafolio web</p>
  </footer>
</template>

<style scoped>
/* ACA SOLO CSS, porq estmos en <STYLE> */

</style>
