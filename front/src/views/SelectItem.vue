<template>
  <v-card>
    <v-card-title class="justify-center">
      Insert a valid NIF
      </v-card-title>
    <v-card-text class="justify-center">
      <v-textarea v-model="message" placeholder="Add a NIF" name="textarea" rows="1" cols="1" class=" justify-center"></v-textarea>
      <v-btn v-on:click="checkNif" class="justify-center">Log In</v-btn>
    </v-card-text>
  </v-card>
  

 </template>

<script>
export default {
  name: "Admin",
  methods:{
    checkNif: function(){
      console.log('Hello');
    }
  }
};
</script>

<style>
</style>
