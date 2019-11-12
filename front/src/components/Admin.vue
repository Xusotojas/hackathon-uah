<template>
  <div>
    <v-card>
      <v-card-title class="justify-center">
        Insert a valid NIF
      </v-card-title>
      <v-card-text class="justify-center">
        <v-textarea
          v-model="message"
          placeholder="Add a NIF"
          name="textarea"
          rows="1"
          cols="1"
          class=" justify-center"
        ></v-textarea>
        <v-btn v-on:click="checkNif" class="justify-center">Log In</v-btn>
      </v-card-text>
    </v-card>
    <v-dialog v-model="dialog" style="background: #fafafa;"
      ><v-row>
        <v-card class="mx-auto my-3" width="374">
          <v-img height="250" src="../../public/cafe.jpg"></v-img>

          <v-card-title>Café</v-card-title>

          <v-card-text>
            <v-row align="center" class="mx-0">
              <v-rating
                :value="4.5"
                color="amber"
                dense
                half-increments
                readonly
                size="14"
              ></v-rating>

              <div class="grey--text ml-4">4.5 (113)</div>
            </v-row>

            <div class="my-4 subtitle-1 black--text">
              0,75€
            </div>

            <div>
              Café expresso.
            </div>
          </v-card-text>

          <v-divider class="mx-4"></v-divider>

          <v-card-title>Café Expresso</v-card-title>
        </v-card>

        <v-card class="mx-auto my-3" width="374">
          <v-img height="250" src="../../public/bocata.jpg"></v-img>

          <v-card-title>Bocata</v-card-title>

          <v-card-text>
            <v-row align="center" class="mx-0">
              <v-rating
                :value="4.7"
                color="amber"
                dense
                half-increments
                readonly
                size="14"
              ></v-rating>

              <div class="grey--text ml-4">4.7 (133)</div>
            </v-row>

            <div class="my-4 subtitle-1 black--text">
              3.5€
            </div>

            <div>
              Bocata de tortilla, lomo o bacon con queso.
            </div>
          </v-card-text>

          <v-divider class="mx-4"></v-divider>

          <v-card-title>Bocata</v-card-title>
        </v-card>

        <v-card class="mx-auto my-3" width="374">
          <v-img height="250" src="../../public/menu.jpg"></v-img>

          <v-card-title>Menú del día</v-card-title>

          <v-card-text>
            <v-row align="center" class="mx-0">
              <v-rating
                :value="4.1"
                color="amber"
                dense
                half-increments
                readonly
                size="14"
              ></v-rating>

              <div class="grey--text ml-4">4.1 (321)</div>
            </v-row>

            <div class="my-4 subtitle-1 black--text">
              5.5€
            </div>

            <div>
              Menú del día
            </div>
          </v-card-text>

          <v-divider class="mx-4"></v-divider>

          <v-card-title>Menú del día</v-card-title>
        </v-card>

        <v-card class="mx-auto my-3" width="374">
          <v-img height="250" src="../../public/hamburguesa.jpg"></v-img>

          <v-card-title>Hamburguesa</v-card-title>

          <v-card-text>
            <v-row align="center" class="mx-0">
              <v-rating
                :value="4.8"
                color="amber"
                dense
                half-increments
                readonly
                size="14"
              ></v-rating>

              <div class="grey--text ml-4">4.8 (254)</div>
            </v-row>

            <div class="my-4 subtitle-1 black--text">
              4.0€
            </div>

            <div>
              Hamburguesa con carne de vacuno, lechuga y bacon.
            </div>
          </v-card-text>

          <v-divider class="mx-4"></v-divider>

          <v-card-title>Hamburguesa</v-card-title>
        </v-card>
      </v-row>
    </v-dialog>
  </div>
</template>

<script>
export default {
  name: "Admin",
  data() {
    return {
      dialog: false
    };
  },
  methods: {
    checkNif: function() {
      this.dialog = true;
    }
  }
};
</script>

<style></style>
