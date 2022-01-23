package tads.eaj.ufrn.exemplofragments


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import tads.eaj.ufrn.exemplofragments.databinding.Fragment1LayoutBinding


class Fragment1 : Fragment() {

    lateinit var binding:Fragment1LayoutBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        Log.i("AULA", "OnCreateView")
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment1_layout,container, false)


        binding.buttonVai1.setOnClickListener {
            Navigation.findNavController(it).navigate(Fragment1Directions.actionFragment1ToFragment2(5))
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_frag1, menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //Toast.makeText(context, "${item.itemId}", Toast.LENGTH_SHORT).show()

        if (item.itemId == R.id.editar){
            Toast.makeText(context, "Usuario clicou em editar", Toast.LENGTH_SHORT).show()
        }

        return NavigationUI.onNavDestinationSelected(item, Navigation.findNavController(requireView()))|| super.onOptionsItemSelected(item)

        //return super.onOptionsItemSelected(item)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("AULA", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("AULA", "onCreate")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("AULA", "onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("AULA", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("AULA", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("AULA", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("AULA", "onStop")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("AULA", "onDestroyView")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("AULA", "onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.i("AULA", "onDetach")

    }
}
