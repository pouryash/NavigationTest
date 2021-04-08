package ir.hami.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.fragment_page1.view.*


class Page1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.tv_page1to2.setOnClickListener {
            NavHostFragment.findNavController(this).
                    navigate(R.id.action_page1Fragment_to_page2Fragment)
        }
        view.tv_page1to3.setOnClickListener {
            NavHostFragment.findNavController(this).
                    navigate(R.id.action_page1Fragment_to_page3Fragment)
        }
    }

}