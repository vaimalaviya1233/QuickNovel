package com.lagradost.quicknovel.providers

import com.lagradost.quicknovel.R
import com.lagradost.quicknovel.WPReader

class IndoWebNovelProvider : WPReader() {
    override val name = "IndoWebNovel"
    override val mainUrl = "https://indowebnovel.id"
    override val iconId = R.drawable.ic_indowebnovel
}
