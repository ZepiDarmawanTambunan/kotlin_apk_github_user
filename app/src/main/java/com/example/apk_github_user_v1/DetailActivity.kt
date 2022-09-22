package com.example.apk_github_user_v1

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.apk_github_user_v1.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title="Detail User"

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User
        binding.apply {
            detailImg.setImageResource(user.avatar)
            detailUsername.text = user.username;
            detailFollowers.text = user.followers;
            detailFollowing.text = user.following;
            detailRepository.text = user.repository;
            detailName.text = user.real_name;
            detailCompany.text = user.user_company;
            detailLocation.text = user.location;
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_back, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.btn_back -> {
                //  startActivity(Intent(this, MainActivity::class.java).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK))
                finish();
            }
        }
    }

    companion object {
        const val EXTRA_USER = "extra_user"
    }
}