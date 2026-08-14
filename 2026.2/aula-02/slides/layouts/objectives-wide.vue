<script setup>
import { computed } from 'vue'
import { useSlideContext } from '@slidev/client'

const { $frontmatter } = useSlideContext()
const features = computed(() => $frontmatter.features || [])
const columns = computed(() => $frontmatter.columns || Math.min(features.value.length || 3, 4))
</script>

<template>
  <SlideFrame mode="topic">
    <div class="feature objectives-wide-grid" :style="{ gridTemplateColumns: `repeat(${columns}, minmax(0, 1fr))` }">
      <Reveal v-for="(feature, index) in features" :key="index" :delay="index * 100">
        <div class="feature-cell card">
          <Icon v-if="feature.icon" :name="feature.icon" class="feature-icon" />
          <div class="feature-title">{{ feature.title }}</div>
          <div class="feature-desc">{{ feature.desc }}</div>
        </div>
      </Reveal>
    </div>
  </SlideFrame>
</template>
