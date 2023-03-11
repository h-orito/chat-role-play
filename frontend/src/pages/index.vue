<template>
  <div v-if="isLoading">Loading...</div>
  <div else>
    <Title>サイト名何にしようかな</Title>
    <p v-if="isLoading">Now Loading!!!!</p>
    <div>
      <input type="button" value="Login" @click="login" />
      <input type="button" value="Logout" @click="logout" />
      <input type="button" value="お試しpublic" @click="sandbox" />
      <input type="button" value="お試しprivate" @click="sandboxPrivate" />
    </div>
    <p>{{ authState }}</p>
  </div>
</template>

<script setup lang="ts">
import { login as doLogin, logout as doLogout } from '~/components/auth/auth0'

const authState = await useAuth()

const login = () => doLogin()
const logout = () => doLogout()
const sandbox = () => {
  useApi('api/v1/public')
}
const sandboxPrivate = () => {
  useApi('api/v1/private')
}
const isLoading = useLoading()
</script>
