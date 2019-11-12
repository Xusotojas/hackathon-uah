<template>
  <v-app>
    <v-app-bar app color="primary" dark>
      <h2>Cafetería UAH</h2>
      <router-link to="/"><span class="white--text">Home</span></router-link>
      <router-link to="/admin"
        ><span class="white--text">Admin</span></router-link
      >
    </v-app-bar>

    <v-content>
      <!-- Provides the application the proper gutter -->
      <v-container fluid>
        <!-- If using vue-router -->
        <router-view></router-view>
      </v-container>
    </v-content>
    <v-footer app
      ><span
        >Created with <v-icon color="red">mdi-heart</v-icon></span
      ></v-footer
    >
  </v-app>
</template>

<script>
export default {
  name: "App",

  components: {},

  data: () => ({
    //
  })
};
</script>
