<template>
  <v-app>
    <v-navigation-drawer app id="nav" clipped v-model="drawer">
      <v-list nav>
        <v-list-item-group v-model="listGroup" color="primary">
          <v-list-item to="/">
            <v-list-item-content>
              <span>Main</span>
            </v-list-item-content>
          </v-list-item>
          <v-list-item to="/admin">
            <v-list-item-content>
              <span>Admin</span>
            </v-list-item-content>
          </v-list-item>
        </v-list-item-group>
      </v-list>
    </v-navigation-drawer>

    <v-app-bar app color="primary" dark clipped-left>
      <h2>Cafetería UAH</h2>
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
