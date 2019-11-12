<template>
  <div class="home">
    <CafeteriaComponent />
  </div>
</template>

<script>
// @ is an alias to /src
import CafeteriaComponent from "@/components/CafeteriaComponent.vue";

export default {
  name: "home",
  components: {
    CafeteriaComponent
  }
};
</script>
