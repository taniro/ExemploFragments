package tads.eaj.ufrn.exemplofragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavArgs
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import tads.eaj.ufrn.exemplofragments.databinding.Fragment2LayoutBinding


class Fragment2 : Fragment() {


    lateinit var binding:Fragment2LayoutBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment2_layout, container, false)
        binding.buttonVai2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragment2_to_fragment3)
        }

        /*
        val args = Fragment2Args.fromBundle(requireArguments())
        Toast.makeText(context, args.id.toString(), Toast.LENGTH_SHORT).show()

         */

        val args: Fragment2Args by navArgs()
        Toast.makeText(context, args.id.toString(), Toast.LENGTH_SHORT).show()


        return binding.root
    }

}
