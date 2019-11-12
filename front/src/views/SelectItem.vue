<template>
  <v-card>
    <Item />
  </v-card>
  

 </template>

<script>
import Item from "@/components/Item.vue";

export default {
  name: "SelectItem",
  methods:{
    checkNif: function(){
      console.log('Hello');
    }
  }, components:{
      Item
  },
  data: function () {
    return {
        items:[{}]
    }
  },
};
</script>

<style>
</style>
