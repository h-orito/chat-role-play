export const login = async (): Promise<void> => {
  if (process.server) return
  const { $auth0 } = useNuxtApp()
  const { loginWithRedirect } = $auth0
  await loginWithRedirect()
}

export const logout = async (): Promise<void> => {
  if (process.server) return
  const { $auth0 } = useNuxtApp()
  const { logout: doLogout } = $auth0
  await doLogout({ logoutParams: { returnTo: window.location.origin } })
}

export const refreshAccessTokenIfNeeded = async (): Promise<string | null> => {
  const { $auth0 } = useNuxtApp()
  const { isAuthenticated, getAccessTokenSilently } = $auth0
  if (!isAuthenticated.value) return null
  return await getAccessTokenSilently()
}
