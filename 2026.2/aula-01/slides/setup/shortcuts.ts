import type { NavOperations, ShortcutOptions } from '@slidev/types'
import { defineShortcutsSetup } from '@slidev/types'

export default defineShortcutsSetup((nav: NavOperations, base: ShortcutOptions[]) => {
  const shortcuts = base.map((shortcut) => {
    if (shortcut.name === 'next_down')
      return { ...shortcut, fn: () => nav.next() }

    if (shortcut.name === 'prev_up')
      return { ...shortcut, fn: () => nav.prev() }

    return shortcut
  })

  return [
    ...shortcuts,
    {
      name: 'next_enter',
      key: 'enter',
      fn: () => nav.next(),
      autoRepeat: true,
    },
  ]
})
