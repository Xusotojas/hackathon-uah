<template>
  <v-app>
    <v-app-bar app color="primary" dark>
      <h2>Cafetería UAH</h2>
    </v-app-bar>

    <v-content>
      <HelloWorld />
    </v-content>
    <v-footer app
      ><span
        >Created with <v-icon color="red">mdi-heart</v-icon></span
      ></v-footer
    >
  </v-app>
</template>

<script>
import HelloWorld from "./components/HelloWorld";

export default {
  name: "App",

  components: {
    HelloWorld
  },

  data: () => ({
    //
  })
};
</script>
