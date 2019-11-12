<template
  ><v-container
    ><v-row>
      <v-card :loading="loading" class="mx-auto my-3" max-width="374">

        <v-card-title>{{ Title }}</v-card-title>

        <v-card-text>
          <v-row align="center" class="mx-0">
            Amount: {{ amount }}
          </v-row>

        </v-card-text>

        <v-divider class="mx-4"></v-divider>

        <v-card-actions>
          <v-btn color="deep-purple accent-4" text @click="blue">
            Select
          </v-btn>
        </v-card-actions>
      </v-card></v-row
    ></v-container
  ></template
>

<script>
export default {
  name: "CafeteriaComponent",
  data: function () {
    return {
      Title: "",
      amount: 0
    }
  },
};
</script>

<style></style>
