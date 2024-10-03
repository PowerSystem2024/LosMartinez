<script setup>
</script>

<template>
    <div class="galeria">
        <!-- PROYECTO 1 -->
        <div class="proyecto">
            <img src="/src/assets/imgproyecto.avif" alt="Proyecto 1">
            <div class="proyecto-info">
                <h3>Ecommerce</h3>
                <p>Creé una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el primer año.</p>
                <div class="proyecto-links">
                    <a href="https://proyecto1.com" class="btn-ver-mas" target="_blank" rel="noopener noreferrer">Ver Proyecto</a>
                    <a href="https://github.com/usuario/proyecto1" class="github-link" target="_blank" rel="noopener noreferrer">Ver Código en GitHub</a>
                </div>
            </div>
        </div>
        <!-- PROYECTO 2 -->
        <div class="proyecto">
            <img src="/src/assets/imgproyecto.avif" alt="Proyecto 2">
            <div class="proyecto-info">
                <h3>Ecommerce</h3>
                <p>Creé una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el primer año.</p>
                <div class="proyecto-links">
                    <a href="https://proyecto1.com" class="btn-ver-mas" target="_blank" rel="noopener noreferrer">Ver Proyecto</a>
                    <a href="https://github.com/usuario/proyecto1" class="github-link" target="_blank" rel="noopener noreferrer">Ver Código en GitHub</a>
                </div>
            </div>
        </div>
  </div>
</template>

<style scoped>
/* .galeria {
    width: 100%;
    height: 200%;
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    justify-content: center;
    background-image: url("/src/assets/imgfondo.avif");
} */
.galeria {
    width: 100%;
    height: 100%;
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    padding: 20px;
    justify-content: center;
    background: linear-gradient(-45deg,black,blue,rgb(91, 192, 238),rgb(224, 255, 175));
    background-size: 400% 400%;
    animation: gradient 15s ease infinite;
}

@keyframes gradient {
    0% {
        background-position: 0% 50%;
    }
    50% {
        background-position: 50% 100%;
    }
    100% {
        background-position: 0% 50%;
    }
}

.proyecto {
    display: flex;
    flex-direction: column;
    border: 2px solid #ddd;
    border-radius: 8px;
    overflow:  hidden;
    background-color: #f9f9f9;
    max-width: 222px;
    flex: 1 1 300px;
}

.proyecto img {
    width: 100%;
    height: auto;
    display: block;
}

.proyecto-info {
    padding: 15px;
    text-align: center;
}

.proyecto-info h3{
    margin: 10px 0;
    font-size: 1.3rem;
    color: #333;
}

.proyecto-info p {
    margin: 10px 0;
    font-size: 1rem;
    color: #000000;
}

.proyecto-links {
    display: flex;
    flex-direction: column;
    gap: 10px;
    margin-top: 10px;
}

.btn-ver-mas {
    background-color: #007bff; /* Color azul */
    color: white; /* Texto en blanco */
    padding: 10px 20px; /* Espaciado interno */
    text-align: center; /* Centrar el texto */
    text-decoration: none; /* Quitar subrayado */
    display: inline-block; /* Mostrar como botón */
    border-radius: 5px; /* Bordes redondeados */
    font-size: 16px; /* Tamaño de fuente */
    font-weight: bold; /* Negrita */
    border: none; /* Sin bordes */
    cursor: pointer; /* Cursor de mano al pasar por encima */
}

.btn-ver-mas:hover {
    background-color: #0056b3; /* Color más oscuro al pasar el mouse */
}
.github-link {
    color: gray; /* Color del texto */
    text-decoration: none; /* Quitar subrayado inicial */
    font-size: 16px; /* Tamaño del texto */
    font-weight: normal; /* Peso de la fuente */
    cursor: pointer; /* Cambia el cursor al pasar por encima */
    transition: all 0.3s ease; /* Transición suave al pasar el mouse */
}

.github-link:hover {
    text-decoration: underline; /* Subrayar al pasar el mouse */
    color: black; /* Cambiar color a negro al hacer hover */
}

</style>